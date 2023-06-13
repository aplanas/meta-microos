SUMMARY = "Execute external programs or internal code blocks as separate process"
DESCRIPTION = "Mojo::IOLoop::ReadWriteProcess is yet another process manager."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Mojo-IOLoop-ReadWriteProcess-0.33-1.2.noarch.rpm"
RPM_HASH = "88078101bdc5cac02697373900f4d5f2dbcb2c5ea2f1441ffb7455cdba41057f470df0500cb766b18fec830620eb385e4d4acd4053101489a52f3446fc1116ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::IOLoop::ReadWriteProcess) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Cpuacct) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Cpuset) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Devices) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Freezer) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Memory) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Netcls) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::Netprio) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::PID) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v1::RDMA) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2::CPU) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2::IO) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2::Memory) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2::PID) \
perl(Mojo::IOLoop::ReadWriteProcess::CGroup::v2::RDMA) \
perl(Mojo::IOLoop::ReadWriteProcess::Container) \
perl(Mojo::IOLoop::ReadWriteProcess::Exception) \
perl(Mojo::IOLoop::ReadWriteProcess::Namespace) \
perl(Mojo::IOLoop::ReadWriteProcess::Pool) \
perl(Mojo::IOLoop::ReadWriteProcess::Queue) \
perl(Mojo::IOLoop::ReadWriteProcess::Session) \
perl(Mojo::IOLoop::ReadWriteProcess::Shared::Lock) \
perl(Mojo::IOLoop::ReadWriteProcess::Shared::Memory) \
perl(Mojo::IOLoop::ReadWriteProcess::Shared::Semaphore) \
perl-Mojo-IOLoop-ReadWriteProcess"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IPC::SharedMem) \
perl(Mojolicious)"

inherit rpm
