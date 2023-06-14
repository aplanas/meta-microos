SUMMARY = "Kannada (ಕನ್ನಡ) Dictionary for Aspell"
DESCRIPTION = "A Kannada (ಕನ್ನಡ) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-kn-0.01.1-2.14.aarch64.rpm"
RPM_HASH = "67d2c333eb6089c6223db9b7c3c98d846138b3bf7ec7a7a765894173da284c13c7596552203f1ee9957bd0c878a81bdbaabbd93a24e618e85dac64f4a852e09f"

RPROVIDES:${PN} += "aspell-kn \
locale-aspell-kn"

RDEPENDS:${PN} += ""

inherit rpm
