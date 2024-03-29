SUMMARY = "Asynchronous event-driven programming"
DESCRIPTION = "This collection of modules allows programs to be written that perform \
asynchronous filehandle IO operations. A typical program using them would \
consist of a single subclass of IO::Async::Loop to act as a container of \
other objects, which perform the actual IO work required by the program. As \
well as IO handles, the loop also supports timers and signal handlers, and \
includes more higher-level functionality built on top of these basic parts."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.802"

RPM_NAME = "perl-IO-Async-0.802-2.3.noarch.rpm"
RPM_HASH = "0730ea1294307fb884f5ee8afe61fa9b510c07a2cae9bfc9d7d0a1dbca93e50c2566a61f3fdc7a294959e9e12755fd93a7285afad8d357042c8e18280842cf44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Future--IO--Impl--IOAsync \
perl-IO--Async \
perl-IO--Async--Channel \
perl-IO--Async--Debug \
perl-IO--Async--File \
perl-IO--Async--FileStream \
perl-IO--Async--Function \
perl-IO--Async--Future \
perl-IO--Async--Handle \
perl-IO--Async--Internals--ChildManager \
perl-IO--Async--Internals--FunctionWorker \
perl-IO--Async--Listener \
perl-IO--Async--Loop \
perl-IO--Async--Loop--Poll \
perl-IO--Async--Loop--Select \
perl-IO--Async--LoopTests \
perl-IO--Async--Metrics \
perl-IO--Async--Notifier \
perl-IO--Async--OS \
perl-IO--Async--OS--MSWin32 \
perl-IO--Async--OS--cygwin \
perl-IO--Async--OS--linux \
perl-IO--Async--PID \
perl-IO--Async--Process \
perl-IO--Async--Protocol \
perl-IO--Async--Protocol--LineStream \
perl-IO--Async--Protocol--Stream \
perl-IO--Async--Resolver \
perl-IO--Async--Routine \
perl-IO--Async--Signal \
perl-IO--Async--Socket \
perl-IO--Async--Stream \
perl-IO--Async--Test \
perl-IO--Async--Timer \
perl-IO--Async--Timer--Absolute \
perl-IO--Async--Timer--Countdown \
perl-IO--Async--Timer--Periodic \
perl-IO-Async"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Future \
perl-Future--Utils \
perl-Socket \
perl-Struct--Dumb"

inherit rpm
