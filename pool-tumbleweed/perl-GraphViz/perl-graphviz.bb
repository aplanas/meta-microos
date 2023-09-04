SUMMARY = "Interface to AT&T's GraphViz. Deprecated. See GraphViz2"
DESCRIPTION = "This module provides an interface to layout and image generation of \
directed and undirected graphs in a variety of formats (PostScript, PNG, \
etc.) using the 'dot', 'neato', 'twopi', 'circo' and 'fdp' programs from \
the Graphviz project (http://www.graphviz.org/ or \
http://www.research.att.com/sw/tools/graphviz/). \
 \
GraphViz is deprecated in favour of GraphViz2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.26"

RPM_NAME = "perl-GraphViz-2.26-1.3.noarch.rpm"
RPM_HASH = "dfcd2c450494e4b57d30831dfb1c2abf8391782d83c78c8f9b45ee4c9ece23ddd2182d5eb8ee0b911b257bce220ba7fec58ad7def9f6ba7991b9cc2e3e616b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--GraphVizProf \
perl-GraphViz \
perl-GraphViz--Data--Grapher \
perl-GraphViz--No \
perl-GraphViz--Parse--RecDescent \
perl-GraphViz--Parse--Yacc \
perl-GraphViz--Parse--Yapp \
perl-GraphViz--Regex \
perl-GraphViz--Small \
perl-GraphViz--XML"

RDEPENDS:${PN} += "cairo \
graphviz \
graphviz-gnome \
pango \
perl--MODULE-COMPAT-5.38.0 \
perl-File--Which \
perl-IPC--Run \
perl-LWP--Simple \
perl-Parse--RecDescent \
perl-XML--Twig \
perl-XML--XPath"

inherit rpm
