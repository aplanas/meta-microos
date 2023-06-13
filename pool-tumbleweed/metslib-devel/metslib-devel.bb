SUMMARY = "Metaheuristic modeling framework and optimization toolkit in modern C++"
DESCRIPTION = "METSlib is a metaheuristic modeling framework and optimization \
toolkit in C++. \
 \
Model and algorithms are modular: any search algorithm can be applied \
to the same model. On the other hand, no assumption is made on the \
model, any problem type can be worked on: timetabling, assignment \
problems, vehicle routing, bin-packing and so on. \
 \
Once the model is implemented in the problem framework, the library \
allows testing of different Taboo Search strategies or even different \
algorithms (Simulated Annealing or other local search based \
algorithms) with a few lines of code."
LICENSE = "CPL-1.0 | GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "metslib-devel-0.5.3-2.7.noarch.rpm"
RPM_HASH = "a1726d4bbec25118bf50314c00485d69721a290c40d7c2598ac00383eb42e7117ab5af30183c664ae4281669fcd79cac296820412a965a2e638227105dbcb7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-devel \
pkgconfig(metslib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
