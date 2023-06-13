SUMMARY = "Cyrillic"
DESCRIPTION = "Support for Cyrillic scripts (Bulgarian, Russian, Serbian, \
Ukrainian), even if Latin alphabets may also be used."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langcyrillic-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "de4eb9872df6c96df52f6fc46bc2bd84fd4604259ce198cd11124b1a66738590cdb79e579cd5d0c424dca0bc40934e9726267cc0c98b2110db128a66d075a56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langcyrillic"

RDEPENDS:${PN} += "texlive-babel-belarusian \
texlive-babel-bulgarian \
texlive-babel-russian \
texlive-babel-serbian \
texlive-babel-serbianc \
texlive-babel-ukrainian \
texlive-churchslavonic \
texlive-cmcyr \
texlive-collection-basic \
texlive-collection-latex \
texlive-cyrillic \
texlive-cyrillic-bin \
texlive-cyrplain \
texlive-disser \
texlive-eskd \
texlive-eskdx \
texlive-gost \
texlive-hyphen-belarusian \
texlive-hyphen-bulgarian \
texlive-hyphen-churchslavonic \
texlive-hyphen-mongolian \
texlive-hyphen-russian \
texlive-hyphen-serbian \
texlive-hyphen-ukrainian \
texlive-lcyw \
texlive-lh \
texlive-lhcyr \
texlive-lshort-bulgarian \
texlive-lshort-mongol \
texlive-lshort-russian \
texlive-lshort-ukr \
texlive-mongolian-babel \
texlive-montex \
texlive-mpman-ru \
texlive-numnameru \
texlive-pst-eucl-translation-bg \
texlive-ruhyphen \
texlive-russ \
texlive-serbian-apostrophe \
texlive-serbian-date-lat \
texlive-serbian-def-cyr \
texlive-serbian-lig \
texlive-t2 \
texlive-texlive-ru \
texlive-texlive-sr \
texlive-ukrhyph \
texlive-xecyrmongolian"

inherit rpm
