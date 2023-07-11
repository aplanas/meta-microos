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

RPM_NAME = "python311-mpi4py-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "e0e309a5012aebeb0d010f02678244ae2e435c56438af2885347539060bc924f52d978cd58658e6a1719a7c3f9d92545ede170409cae1ba6bc458859faa91782"

RPROVIDES:${PN} += "libmpe.so \
libvt-hyb.so \
libvt-mpi.so \
libvt.so \
python3-mpi4py \
python3.11dist-mpi4py \
python311-mpi4py \
python3dist-mpi4py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
python-abi"

inherit rpm
