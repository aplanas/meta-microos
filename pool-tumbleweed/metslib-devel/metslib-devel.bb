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

RPM_NAME = "metslib-devel-0.5.3-2.8.noarch.rpm"
RPM_HASH = "7a6923fa213308f7b91fb397c19d5c2f20933cf915d28d827837b101c5e27e5d2b93f3be77bd7c0ab815a05e91ee9f0f0976231eb33294068dbc8e625bafb1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-devel \
pkgconfig-metslib"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
