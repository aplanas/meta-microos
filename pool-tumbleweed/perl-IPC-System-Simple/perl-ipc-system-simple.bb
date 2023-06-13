SUMMARY = "Run commands simply, with detailed diagnostics"
DESCRIPTION = "Calling Perl's in-built 'system()' function is easy, determining if it was \
successful is _hard_. Let's face it, '$?' isn't the nicest variable in the \
world to play with, and even if you _do_ check it, producing a \
well-formatted error string takes a lot of work. \
 \
'IPC::System::Simple' takes the hard work out of calling external commands. \
In fact, if you want to be really lazy, you can just write: \
 \
    use IPC::System::Simple qw(system); \
 \
and all of your 'system' commands will either succeed (run to completion \
and return a zero exit value), or die with rich diagnostic messages. \
 \
The 'IPC::System::Simple' module also provides a simple replacement to \
Perl's backticks operator. Simply write: \
 \
    use IPC::System::Simple qw(capture); \
 \
and then use the capture() command just like you'd use backticks. If \
there's an error, it will die with a detailed description of what went \
wrong. Better still, you can even use 'capturex()' to run the equivalent of \
backticks, but without the shell: \
 \
    use IPC::System::Simple qw(capturex); \
 \
    my $result = capturex($command, @args); \
 \
If you want more power than the basic interface, including the ability to \
specify which exit values are acceptable, trap errors, or process \
diagnostics, then read on!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30"

RPM_NAME = "perl-IPC-System-Simple-1.30-1.13.noarch.rpm"
RPM_HASH = "e2a66180ea5fe94a9a42912c9e99c8d6b72f9ecd843fd296f55e70489ebe68bf8346f0302bb6f11b93c3170c1d8696bf0b337bde489eb8260dab629ea65287e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IPC::System::Simple) \
perl-IPC-System-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
