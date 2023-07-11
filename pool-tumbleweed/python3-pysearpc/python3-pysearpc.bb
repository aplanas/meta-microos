SUMMARY = "Python files for libsearpc"
DESCRIPTION = "The python-pysearpc package contains python files to make use of libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230527"

RPM_NAME = "python3-pysearpc-3.3.0.20230527-1.1.aarch64.rpm"
RPM_HASH = "c3037f1617db052fddb86090196ab5af8d1c6799af2889a5a759072862833f2aa2b97c858b2487e0f03f09abacfce61423b878ef0ccd896a4c14db4218f9ceef"

RPROVIDES:${PN} += "python3-pysearpc"

RDEPENDS:${PN} += "libsearpc1 \
python-abi"

inherit rpm
