SUMMARY = "Multicore architecture exploitation for OCaml programs with minimal modifications"
DESCRIPTION = "If you want to use your many cores to accelerate an operation \
which happens to be a map, fold or map/fold (map-reduce), just use \
Parmap's parmap, parfold and parmapfold primitives in place of the \
standard List.map and friends; you can specify the number of \
subprocesses to use with the optional parameter ncores, and the \
size of granularity of the parallel computation with the optional \
parameter chunksize."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "7d9b06304f65032cecccffc20d2bc4a7f007a5a6007f0f0f419019ae4923e4954a26f06c1c3e0e667ade899e47e7ecd644949f1d0702b9c61a1fa055252a4d2c"

RPROVIDES:${PN} += "ocaml-parmap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
