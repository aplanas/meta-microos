SUMMARY = "MPI for Python"
DESCRIPTION = "This package provides Python bindings for the Message Passing \
Interface (MPI) standard. It is implemented on top of the MPI-1/2/3 \
specification and exposes an API which grounds on the standard MPI-2 \
C++ bindings. \
 \
This package supports: \
  + Communication of any picklable Python object \
    * Point-to-point: send & receive \
    * Collective: broadcast, scatter & gather, reductions \
  + Communication of Python object exposing the Python buffer \
    interface (NumPy arrays, builtin bytes/string/array objects) \
    * Point-to-point: blocking/nonbloking/persistent send & receive \
    * Collective: broadcast, block/vector scatter & gather, reductions \
  + Process groups and communication domains \
    * Creation of new intra/inter communicators \
    * Cartesian & graph topologies \
  + Parallel input/output: \
    * read & write \
    * blocking/nonbloking & collective/noncollective \
    * individual/shared file pointers & explicit offset \
  + Dynamic process management \
    * spawn & spawn multiple \
    * accept/connect \
    * name publishing & lookup \
  + One-sided operations \
    * remote memory access: put, get, accumulate \
    * passive target syncronization: start/complete & post/wait \
    * active target syncronization: lock & unlock"
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python39-mpi4py-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "2dcda1a1329e36ed876325c35d88272595c7846d25bc4a6797586f5b09b4af799b8d2401db1d4441242624ec61c5c9b5b53cea5594acf2c50ef6e1b1d4c9eea0"

RPROVIDES:${PN} += "libmpe.so()(64bit) \
libvt-hyb.so()(64bit) \
libvt-mpi.so()(64bit) \
libvt.so()(64bit) \
python3.9dist(mpi4py) \
python39-mpi4py \
python39-mpi4py(aarch-64) \
python3dist(mpi4py)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpi.so.40()(64bit) \
python(abi)"

inherit rpm
