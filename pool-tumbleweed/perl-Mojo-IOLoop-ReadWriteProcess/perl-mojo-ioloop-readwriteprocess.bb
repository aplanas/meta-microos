SUMMARY = "Execute external programs or internal code blocks as separate process"
DESCRIPTION = "Mojo::IOLoop::ReadWriteProcess is yet another process manager."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Mojo-IOLoop-ReadWriteProcess-0.33-1.3.noarch.rpm"
RPM_HASH = "0099df7259af69bb3dbd587a9fe27efb175dbeb9f0df5cba7307717df8b29465b23fd9b63aad5b0a4e7ffb80c07253d281fcd43df2546e3a6c400f1eeeff4f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1 \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Cpuacct \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Cpuset \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Devices \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Freezer \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Netcls \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Netprio \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--PID \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--RDMA \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2 \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--CPU \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--IO \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--PID \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--RDMA \
perl-Mojo--IOLoop--ReadWriteProcess--Container \
perl-Mojo--IOLoop--ReadWriteProcess--Exception \
perl-Mojo--IOLoop--ReadWriteProcess--Namespace \
perl-Mojo--IOLoop--ReadWriteProcess--Pool \
perl-Mojo--IOLoop--ReadWriteProcess--Queue \
perl-Mojo--IOLoop--ReadWriteProcess--Session \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Lock \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Semaphore \
perl-Mojo-IOLoop-ReadWriteProcess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--SharedMem \
perl-Mojolicious"

inherit rpm
