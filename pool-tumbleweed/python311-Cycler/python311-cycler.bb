SUMMARY = "Composable style cycles"
DESCRIPTION = "When plotting more than one line it is common to want to be able to \
cycle over one or more artist styles. For simple cases than can be \
done with out too much trouble. \
 \
However, if you want to do something more complicated, the plotting \
logic can quickly become very involved. To address this and allow \
easy cycling over arbitrary kwargs the Cycler class, a composable \
kwarg iterator, was developed."
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python311-Cycler-0.11.0-2.3.noarch.rpm"
RPM_HASH = "5afea929d2e36db6a8283733c47eced85a6d5c777d1464a00ee94a39860c58583e7e69f6336f4e736a455aa2f0e58b09d885ea4c71a18b10a3424a2cef38d409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cycler \
python3.11dist-cycler \
python311-Cycler \
python3dist-cycler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
