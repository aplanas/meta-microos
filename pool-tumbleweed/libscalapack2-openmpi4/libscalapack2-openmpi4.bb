SUMMARY = "ScaLAPACK libraries compiled against openmpi4"
DESCRIPTION = "The ScaLAPACK (or Scalable LAPACK) library includes a subset \
of LAPACK routines redesigned for distributed memory MIMD \
parallel computers. It is currently written in a \
Single-Program-Multiple-Data style using explicit message \
passing for interprocessor communication. It assumes \
matrices are laid out in a two-dimensional block cyclic \
decomposition. \
 \
ScaLAPACK is designed for heterogeneous computing and is \
portable on any computer that supports MPI or PVM. \
 \
Like LAPACK, the ScaLAPACK routines are based on \
block-partitioned algorithms in order to minimize the frequency \
of data movement between different levels of the memory hierarchy. \
(For such machines, the memory hierarchy includes the off-processor \
memory of other processors, in addition to the hierarchy of registers, \
cache, and local memory on each processor.) The fundamental building \
blocks of the ScaLAPACK library are distributed memory versions (PBLAS) \
of the Level 1, 2 and 3 BLAS, and a set of Basic Linear Algebra \
Communication Subprograms (BLACS) for communication tasks that arise \
frequently in parallel linear algebra computations. In the ScaLAPACK \
routines, all interprocessor communication occurs within the PBLAS and the \
BLACS. One of the design goals of ScaLAPACK was to have the ScaLAPACK \
routines resemble their LAPACK equivalents as much as possible. \
 \
This package contains ScaLAPACK	libraries compiled with	openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "640dda5298a570b9f5fc356ea2416e4de9d1e2107919efffea35d010645a82b169bd6599d7514372380dc52ddec6961b89c32f6ddb5c65e8204adcad3e9e0826"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-openmpi4 \
scalapack-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.40"

inherit rpm
