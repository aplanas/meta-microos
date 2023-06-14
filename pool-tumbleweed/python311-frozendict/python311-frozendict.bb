SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python311-frozendict-2.3.5-2.4.aarch64.rpm"
RPM_HASH = "d746710ed1e88254d8c6a72c81e7716c24f965258f3bdb5c9f688905e7e8cb48a5b605290cc69b4fd04ecb5c36a31a10607d02214564c4077211f5fcaae69331"

RPROVIDES:${PN} += "python3.11dist-frozendict \
python311-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
