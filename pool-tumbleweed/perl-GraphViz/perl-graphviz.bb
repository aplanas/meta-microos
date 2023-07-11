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

RPM_NAME = "perl-GraphViz-2.26-1.2.noarch.rpm"
RPM_HASH = "69c21413cb8db623960d2390fa0bf28cedffb9d74b524b1d805fd693ffc06e6c5a20677b4b7b6effd199b648b7ad5f43a71fc18968f90799c74d20a10542da0b"
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
perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-IPC--Run \
perl-LWP--Simple \
perl-Parse--RecDescent \
perl-XML--Twig \
perl-XML--XPath"

inherit rpm
