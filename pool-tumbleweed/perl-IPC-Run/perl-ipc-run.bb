SUMMARY = "System() and background procs w/ piping, redirs, ptys (Unix, Win32)"
DESCRIPTION = "IPC::Run allows you to run and interact with child processes using files, \
pipes, and pseudo-ttys. Both system()-style and scripted usages are \
supported and may be mixed. Likewise, functional and OO API styles are both \
supported and may be mixed. \
 \
Various redirection operators reminiscent of those seen on common Unix and \
DOS command lines are provided."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20220807.0"

RPM_NAME = "perl-IPC-Run-20220807.0-1.3.noarch.rpm"
RPM_HASH = "0ffb7a80d2e0d1a98aabb54252512733512bd645329c91ec07958ccf69235763734d826eec991a3b27500238e5288dd2cfde1a9235ff415f873a372fa8b1cdec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--Run \
perl-IPC--Run--Debug \
perl-IPC--Run--IO \
perl-IPC--Run--Timer \
perl-IPC--Run--Win32Helper \
perl-IPC--Run--Win32IO \
perl-IPC--Run--Win32Process \
perl-IPC--Run--Win32Pump \
perl-IPC-Run"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Pty"

inherit rpm
