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

RPM_NAME = "python39-Cycler-0.11.0-2.1.noarch.rpm"
RPM_HASH = "0b0e44865c4dc29ed07017badce4dbb47591b5b8d550a972f6b2fe89271e873008b17faae95ba804af0fcdc3b1535980bc575f9be7d665c0f0007c76cb44d1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cycler) \
python39-Cycler \
python3dist(cycler)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
