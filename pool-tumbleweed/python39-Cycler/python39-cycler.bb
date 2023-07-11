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

RPM_NAME = "python39-Cycler-0.11.0-2.3.noarch.rpm"
RPM_HASH = "b5157c1140658978d185215e3c59c7bda00642a705714221d5b1ac452da6c1017eb7e1bb382c7767df7e32d93809bdae3c95cf6a8a3ecdfbfb3b8ae15d42a81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cycler \
python39-Cycler \
python3dist-cycler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
