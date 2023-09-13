SUMMARY = "Fast python callback/event system modeled after Qt Signals"
DESCRIPTION = "Psygnal (pronounced 'signal') is a pure python implementation of the [observer \
pattern](https://en.wikipedia.org/wiki/Observer_pattern), with the API of \
[Qt-style Signals](https://doc.qt.io/qt-5/signalsandslots.html) with (optional) \
signature and type checking, and support for threading."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python311-psygnal-0.9.3-1.1.noarch.rpm"
RPM_HASH = "a97f60825ed8e3a464b5a630ee690f031581b7e18e44748b01918419280897506c4e9605626a3b4b01b3d6d03702679d6dc01be39bce01be2d6a4589158f5a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psygnal \
python3.11dist-psygnal \
python311-psygnal \
python3dist-psygnal"

RDEPENDS:${PN} += "python-abi \
python311-mypy-extensions \
python311-typing-extensions"

inherit rpm
