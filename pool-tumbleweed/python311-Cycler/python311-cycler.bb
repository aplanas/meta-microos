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

RPM_NAME = "python311-Cycler-0.11.0-2.1.noarch.rpm"
RPM_HASH = "a1b155d70e09cb590314596cb6a152fa6404b50232ef22f60abebb86cfb2ded1f704aa54ec176fb3dc3c72d4049aac0d226a86a574382548540b0573b695da48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cycler) \
python311-Cycler \
python3dist(cycler)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
