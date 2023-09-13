SUMMARY = "Fast python callback/event system modeled after Qt Signals"
DESCRIPTION = "Psygnal (pronounced 'signal') is a pure python implementation of the [observer \
pattern](https://en.wikipedia.org/wiki/Observer_pattern), with the API of \
[Qt-style Signals](https://doc.qt.io/qt-5/signalsandslots.html) with (optional) \
signature and type checking, and support for threading."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python310-psygnal-0.9.3-1.1.noarch.rpm"
RPM_HASH = "43254bf7baa1e2ff3084e6153af649f1e320a155b8024855148fdde1926df2286bb5c0401be13047efc34fb7fb611ca6c625ad6ddac1e78212ad47b4eff89de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-psygnal \
python310-psygnal \
python3dist-psygnal"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-typing-extensions"

inherit rpm
