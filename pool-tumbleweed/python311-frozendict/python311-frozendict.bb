SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python311-frozendict-2.3.5-3.3.aarch64.rpm"
RPM_HASH = "19639e230f39bc7225cbc161fefccbae04baba8ee8cbb22d2bf6248c0800b9c37dc5a544cf1b5255de1a983e48fe1efbdce2f1fecd8cb0bf82a9a78fd60abb06"

RPROVIDES:${PN} += "python3-frozendict \
python3.11dist-frozendict \
python311-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
