SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python39-frozendict-2.3.5-3.3.aarch64.rpm"
RPM_HASH = "71bc5c0c61667635ba3e34f199e8da2823007d98a873d3563392f89cb8b14b206ec643f1f2fb92964f6ac1f633cb49c68b1954f1040e363a04141b8eafbf8909"

RPROVIDES:${PN} += "python3.9dist-frozendict \
python39-frozendict \
python3dist-frozendict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
