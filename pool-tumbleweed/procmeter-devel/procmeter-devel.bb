SUMMARY = "Development files for the procmeter system parameter display program"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc. \
 \
This package provides files needed to build modules for procmeter."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-devel-3.6+svn415-1.10.aarch64.rpm"
RPM_HASH = "951a0284845316d0592d618ff8e5593396c93988530a2a2a8b6d473bf43fbaa6d592510114dfb3af71d0bc2b3c9e39d33c773b320b7de557946cc44a7b179e9d"

RPROVIDES:${PN} += "procmeter-devel"

RDEPENDS:${PN} += "procmeter"

inherit rpm
