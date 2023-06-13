SUMMARY = "Visualization tools for the audit subsystem"
DESCRIPTION = "The audit-visualize package contains scripts to produce flow graphs and \
bar charts from audit data."
LICENSE = "GPL-2.0+"

PV = "1.5.2"

RPM_NAME = "audit-visualize-1.5.2-114.17.noarch.rpm"
RPM_HASH = "baf964ce4e6a73de9e23277c2ccefdd5b302c7271d163c3d6333b20ad68730db4f4bffb2ac1dd02cbbd1c5967807322a92fd3d3ef0ba69b72eac16d2d5e466fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audit-visualize"

RDEPENDS:${PN} += "audit \
gnuplot \
graphviz"

inherit rpm
