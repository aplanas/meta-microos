SUMMARY = "a bare-bones HTML parser"
DESCRIPTION = "This is the HTML::SimpleParse module.  It is a bare-bones HTML parser, \
similar to HTML::Parser, but with a couple important distinctions: \
 \
First, HTML::Parser knows which tags can contain other tags, which \
start tags have corresponding end tags, which tags can exist only in \
the <HEAD> portion of the document, and so forth.  HTML::SimpleParse \
does not know any of these things.  It just finds tags and text in the \
HTML you give it, it does not care about the specific content of these \
tags (though it does distiguish between different _types_ of tags, such \
as comments, starting tags like <b>, ending tags like </b>, and so on). \
 \
Second, HTML::SimpleParse does not create a hierarchical tree of HTML \
content, but rather a simple linear list.  It does not pay any \
attention to balancing start tags with corresponding end tags, or which \
pairs of tags are inside other pairs of tags. \
 \
Because of these characteristics, you can make a very effective HTML \
filter by sub-classing HTML::SimpleParse. \
 \
 \
 \
Authors: \
-------- \
    Ken Williams <ken@forum.swarthmore.edu>"
LICENSE = "Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-HTML-SimpleParse-0.12-284.17.noarch.rpm"
RPM_HASH = "ccc7588d9c6cf12ef3e3c192f627810c4ebbdae96c48385b602df927b94a5a590af33dfcd73df19246a91c1391093c2bd8fb35ca5d57d1c9b36bf5ba1b527f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HTML-SimpleParse \
perl-HTML--SimpleParse \
perl-HTML-SimpleParse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
