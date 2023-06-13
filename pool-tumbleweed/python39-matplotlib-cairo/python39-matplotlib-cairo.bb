SUMMARY = "Cairo backend for python39-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-cairo-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "42ce14f8d8aa90ae12505d875367449a80992527586025788614992e9d498c7ee6b8cfa175cdd265913e12fc1ce4a67b461c74dce067a0f213092558d60c8c5c"

RPROVIDES:${PN} += "python39-matplotlib-cairo \
python39-matplotlib-cairo(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python39-cairo \
python39-matplotlib"

inherit rpm
