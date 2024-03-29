SUMMARY = "A wiki compiler"
DESCRIPTION = "Ikiwiki is a wiki compiler. It converts wiki pages into HTML pages \
suitable for publishing on a website. Ikiwiki stores pages and history \
in a revision control system such as Subversion or Git. There are many \
other features, including support for blogging and podcasting, as well \
as a large array of plugins."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause"

PV = "3.20200202.3"

RPM_NAME = "ikiwiki-3.20200202.3-2.15.noarch.rpm"
RPM_HASH = "b3b77daca5aefb958265a0db3e453e6eb1211e3b6d3299f20fdb13675ba98f76fbcdf8fc7af5647136c7d12aa14daff087b4e4d0d29d6238c21973be563bde1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ikiwiki \
ikiwiki \
perl-IkiWiki \
perl-IkiWiki--ErrorReason \
perl-IkiWiki--FailReason \
perl-IkiWiki--PageSpec \
perl-IkiWiki--Plugin--404 \
perl-IkiWiki--Plugin--aggregate \
perl-IkiWiki--Plugin--amazon-s3 \
perl-IkiWiki--Plugin--anonok \
perl-IkiWiki--Plugin--attachment \
perl-IkiWiki--Plugin--autoindex \
perl-IkiWiki--Plugin--blogspam \
perl-IkiWiki--Plugin--brokenlinks \
perl-IkiWiki--Plugin--bzr \
perl-IkiWiki--Plugin--calendar \
perl-IkiWiki--Plugin--camelcase \
perl-IkiWiki--Plugin--color \
perl-IkiWiki--Plugin--comments \
perl-IkiWiki--Plugin--conditional \
perl-IkiWiki--Plugin--creole \
perl-IkiWiki--Plugin--cutpaste \
perl-IkiWiki--Plugin--cvs \
perl-IkiWiki--Plugin--darcs \
perl-IkiWiki--Plugin--date \
perl-IkiWiki--Plugin--ddate \
perl-IkiWiki--Plugin--editdiff \
perl-IkiWiki--Plugin--editpage \
perl-IkiWiki--Plugin--edittemplate \
perl-IkiWiki--Plugin--emailauth \
perl-IkiWiki--Plugin--embed \
perl-IkiWiki--Plugin--external \
perl-IkiWiki--Plugin--favicon \
perl-IkiWiki--Plugin--filecheck \
perl-IkiWiki--Plugin--flattr \
perl-IkiWiki--Plugin--format \
perl-IkiWiki--Plugin--fortune \
perl-IkiWiki--Plugin--getsource \
perl-IkiWiki--Plugin--git \
perl-IkiWiki--Plugin--goodstuff \
perl-IkiWiki--Plugin--google \
perl-IkiWiki--Plugin--goto \
perl-IkiWiki--Plugin--graphviz \
perl-IkiWiki--Plugin--haiku \
perl-IkiWiki--Plugin--headinganchors \
perl-IkiWiki--Plugin--highlight \
perl-IkiWiki--Plugin--hnb \
perl-IkiWiki--Plugin--html \
perl-IkiWiki--Plugin--htmlbalance \
perl-IkiWiki--Plugin--htmlscrubber \
perl-IkiWiki--Plugin--htmltidy \
perl-IkiWiki--Plugin--httpauth \
perl-IkiWiki--Plugin--img \
perl-IkiWiki--Plugin--inline \
perl-IkiWiki--Plugin--link \
perl-IkiWiki--Plugin--linkmap \
perl-IkiWiki--Plugin--listdirectives \
perl-IkiWiki--Plugin--localstyle \
perl-IkiWiki--Plugin--lockedit \
perl-IkiWiki--Plugin--loginselector \
perl-IkiWiki--Plugin--map \
perl-IkiWiki--Plugin--mdwn \
perl-IkiWiki--Plugin--mercurial \
perl-IkiWiki--Plugin--meta \
perl-IkiWiki--Plugin--mirrorlist \
perl-IkiWiki--Plugin--moderatedcomments \
perl-IkiWiki--Plugin--monotone \
perl-IkiWiki--Plugin--more \
perl-IkiWiki--Plugin--norcs \
perl-IkiWiki--Plugin--notifyemail \
perl-IkiWiki--Plugin--opendiscussion \
perl-IkiWiki--Plugin--openid \
perl-IkiWiki--Plugin--orphans \
perl-IkiWiki--Plugin--osm \
perl-IkiWiki--Plugin--otl \
perl-IkiWiki--Plugin--pagecount \
perl-IkiWiki--Plugin--pagestats \
perl-IkiWiki--Plugin--pagetemplate \
perl-IkiWiki--Plugin--parentlinks \
perl-IkiWiki--Plugin--passwordauth \
perl-IkiWiki--Plugin--pingee \
perl-IkiWiki--Plugin--pinger \
perl-IkiWiki--Plugin--po \
perl-IkiWiki--Plugin--poll \
perl-IkiWiki--Plugin--polygen \
perl-IkiWiki--Plugin--postsparkline \
perl-IkiWiki--Plugin--postsparkline--formula \
perl-IkiWiki--Plugin--prettydate \
perl-IkiWiki--Plugin--progress \
perl-IkiWiki--Plugin--rawhtml \
perl-IkiWiki--Plugin--recentchanges \
perl-IkiWiki--Plugin--recentchangesdiff \
perl-IkiWiki--Plugin--relativedate \
perl-IkiWiki--Plugin--remove \
perl-IkiWiki--Plugin--rename \
perl-IkiWiki--Plugin--repolist \
perl-IkiWiki--Plugin--rsync \
perl-IkiWiki--Plugin--search \
perl-IkiWiki--Plugin--shortcut \
perl-IkiWiki--Plugin--sidebar \
perl-IkiWiki--Plugin--signinedit \
perl-IkiWiki--Plugin--smiley \
perl-IkiWiki--Plugin--sortnaturally \
perl-IkiWiki--Plugin--sparkline \
perl-IkiWiki--Plugin--svn \
perl-IkiWiki--Plugin--table \
perl-IkiWiki--Plugin--tag \
perl-IkiWiki--Plugin--template \
perl-IkiWiki--Plugin--templatebody \
perl-IkiWiki--Plugin--testpagespec \
perl-IkiWiki--Plugin--teximg \
perl-IkiWiki--Plugin--textile \
perl-IkiWiki--Plugin--theme \
perl-IkiWiki--Plugin--tla \
perl-IkiWiki--Plugin--toc \
perl-IkiWiki--Plugin--toggle \
perl-IkiWiki--Plugin--trail \
perl-IkiWiki--Plugin--transient \
perl-IkiWiki--Plugin--txt \
perl-IkiWiki--Plugin--typography \
perl-IkiWiki--Plugin--underlay \
perl-IkiWiki--Plugin--userlist \
perl-IkiWiki--Plugin--version \
perl-IkiWiki--Plugin--websetup \
perl-IkiWiki--Plugin--wikitext \
perl-IkiWiki--Plugin--wmd \
perl-IkiWiki--RPC--XML \
perl-IkiWiki--Receive \
perl-IkiWiki--Setup \
perl-IkiWiki--Setup--Automator \
perl-IkiWiki--Setup--Standard \
perl-IkiWiki--Setup--Yaml \
perl-IkiWiki--SortSpec \
perl-IkiWiki--SuccessReason"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0 \
perl-Authen--Passphrase \
perl-CGI \
perl-CGI--FormBuilder \
perl-CGI--Session \
perl-Crypt--SSLeay \
perl-Cwd \
perl-Data--Dumper \
perl-Date--Parse \
perl-Digest--SHA \
perl-Encode \
perl-ExtUtils--MakeMaker \
perl-File--Find \
perl-File--MimeInfo \
perl-File--Path \
perl-File--Spec \
perl-File--chdir \
perl-Getopt--Long \
perl-Gravatar--URL \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Scrubber \
perl-HTML--Template \
perl-HTML--Tree \
perl-HTML--TreeBuilder \
perl-Image--Magick \
perl-JSON \
perl-Locale--gettext \
perl-Mail--Sendmail \
perl-Memoize \
perl-Net--INET6Glue \
perl-Net--OpenID--Consumer \
perl-Net--OpenID--VerifiedIdentity \
perl-RPC--XML \
perl-Sort--Naturally \
perl-Storable \
perl-Term--ReadLine--Gnu \
perl-Text--CSV \
perl-Text--Markdown \
perl-URI \
perl-URI--Escape \
perl-URI--Fetch \
perl-XML--Feed \
perl-XML--Simple \
perl-XML--Writer \
perl-YAML--XS \
python3-docutils"

inherit rpm
