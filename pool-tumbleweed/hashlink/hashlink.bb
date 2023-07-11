SUMMARY = "A virtual machine for Haxe"
DESCRIPTION = "HashLink is a virtual machine for Haxe. \
Haxe supports two modes of compilation for HashLink: \
* Compilation to HashLink bytecode. This mode has a very fast compilation time, \
  so it is suitable for daily development. \
* Compilation to HashLink/C code, compiled with a native compiler to a regular \
  executable. This mode results in the best performance, so it is suitable for \
  final releases."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "hashlink-1.13-1.4.aarch64.rpm"
RPM_HASH = "3fd1e9ff37c51853907cf34feecc5d889534e6bbc7cfa69db3cf6a268d491a19c31711c094dbe779acb7d6a072813f17d46622ea284eebedced4a4064192e2f1"

RPROVIDES:${PN} += "hashlink"

RDEPENDS:${PN} += "hashlink-hdlls"

inherit rpm
