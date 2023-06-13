SUMMARY = "Electronic components for use in the Fritzing app (aka the parts library)"
DESCRIPTION = "Fritzing is an open-source initiative to support designers, artists, \
researchers and hobbyists to take the step from physical prototyping \
to actual product. It is in the spirit of Processing and Arduino which \
allows users to document their Arduino and other electronic-based \
prototypes, and to create a PCB layout for manufacturing. \
 \
This packages contains the parts definitions for the electronic \
components used in the Fritzing app."
LICENSE = "CC-BY-SA-3.0"

PV = "0.9.3b"

RPM_NAME = "fritzing-parts-0.9.3b-1.15.noarch.rpm"
RPM_HASH = "793f76402793c850afd0c99e85bda2402ddf3404f6ec293684cad57f866be18f224cff86bdc3c6e161a97886c34429c59a9d78106482cb4285f1714506d03abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fritzing-parts"

RDEPENDS:${PN} += ""

inherit rpm
