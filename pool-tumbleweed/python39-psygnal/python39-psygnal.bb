SUMMARY = "Fast python callback/event system modeled after Qt Signals"
DESCRIPTION = "Psygnal (pronounced 'signal') is a pure python implementation of the [observer \
pattern](https://en.wikipedia.org/wiki/Observer_pattern), with the API of \
[Qt-style Signals](https://doc.qt.io/qt-5/signalsandslots.html) with (optional) \
signature and type checking, and support for threading."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python39-psygnal-0.9.3-1.1.noarch.rpm"
RPM_HASH = "865e59af0f64367e10e1e8abd7860ff4ca2682272d46fa6ce9a9bb3bfc69d19ff1e519a829bcb9f56719dabbf8ace79dde998c7a8e6cf92fd9a8d52e9fdce04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-psygnal \
python39-psygnal \
python3dist-psygnal"

RDEPENDS:${PN} += "python-abi \
python39-mypy-extensions \
python39-typing-extensions"

inherit rpm
