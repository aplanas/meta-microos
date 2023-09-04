SUMMARY = "Launch and Control Background Processes"
DESCRIPTION = "The Proc::Simple package provides objects mimicing real-life processes from \
a user's point of view. A new process object is created by \
 \
   $myproc = Proc::Simple->new(); \
 \
Either external programs or perl subroutines can be launched and controlled \
as processes in the background. \
 \
A 10-second sleep process, for example, can be launched as an external \
program as in \
 \
   $myproc->start('/bin/sleep 10');    # or \
   $myproc->start('/bin/sleep', '10'); \
 \
or as a perl subroutine, as in \
 \
   sub mysleep { sleep(shift); }    # Define mysleep() \
   $myproc->start(\\&mysleep, 10);   # Launch it. \
 \
or even as \
 \
   $myproc->start(sub { sleep(10); }); \
 \
The _start_ Method returns immediately after starting the specified process \
in background, i.e. there's no blocking. It returns _1_ if the process has \
been launched successfully and _0_ if not. \
 \
The _poll_ method checks if the process is still running \
 \
   $running = $myproc->poll(); \
 \
and returns _1_ if it is, _0_ if it's not. Finally, \
 \
   $myproc->kill(); \
 \
terminates the process by sending it the SIGTERM signal. As an option, \
another signal can be specified. \
 \
   $myproc->kill('SIGUSR1'); \
 \
sends the SIGUSR1 signal to the running process. _kill_ returns _1_ if it \
succeeds in sending the signal, _0_ if it doesn't. \
 \
The methods are discussed in more detail in the next section. \
 \
A destructor is provided so that a signal can be sent to the forked \
processes automatically should the process object be destroyed or if the \
process exits. By default this behaviour is turned off (see the \
kill_on_destroy and signal_on_destroy methods)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.32"

RPM_NAME = "perl-Proc-Simple-1.32-1.27.noarch.rpm"
RPM_HASH = "404a1570a85904a420cb72498cbab2c73017c14f103c41bf4168fb3aef319c4905eb4a7322e92fbd32f708440dc75ac750504080c4a2a7ce5c378b7686d803fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--Simple \
perl-Proc-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
