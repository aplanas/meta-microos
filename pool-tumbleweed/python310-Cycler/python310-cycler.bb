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

RPM_NAME = "python310-Cycler-0.11.0-2.3.noarch.rpm"
RPM_HASH = "56b96abcbb0980f97d4c11fee15126ad8409af9bd9ca892c1881124b11b36cf69fd64379799c7f90e7e974a5481a89b99fe7dec204c83622b6deaef0afe966f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cycler \
python310-Cycler \
python3dist-cycler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
