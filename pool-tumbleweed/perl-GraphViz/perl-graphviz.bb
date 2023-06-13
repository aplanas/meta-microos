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

RPM_NAME = "perl-GraphViz-2.26-1.1.noarch.rpm"
RPM_HASH = "99ed5554a6fb63d0733fb6f96cba9421a83e1ae3abc66d8e235821fa2ff5666b3f96275b67706e86ccb5cdb8dc97597dbd3083eef8624c10f133855215b0c6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DB) \
perl(Devel::GraphVizProf) \
perl(GraphViz) \
perl(GraphViz::Data::Grapher) \
perl(GraphViz::No) \
perl(GraphViz::Parse::RecDescent) \
perl(GraphViz::Parse::Yacc) \
perl(GraphViz::Parse::Yapp) \
perl(GraphViz::Regex) \
perl(GraphViz::Small) \
perl(GraphViz::XML) \
perl-GraphViz"

RDEPENDS:${PN} += "cairo \
graphviz \
graphviz-gnome \
pango \
perl(:MODULE_COMPAT_5.36.0) \
perl(File::Which) \
perl(IPC::Run) \
perl(LWP::Simple) \
perl(Parse::RecDescent) \
perl(XML::Twig) \
perl(XML::XPath)"

inherit rpm
