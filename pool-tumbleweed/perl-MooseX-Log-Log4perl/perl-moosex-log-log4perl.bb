SUMMARY = "Logging Role for Moose based on Log::Log4perl"
DESCRIPTION = "A logging role building a very lightweight wrapper to Log::Log4perl for use \
with your Moose or Moo classes. The initialization of the Log4perl instance \
must be performed prior to logging the first log message. Otherwise the \
default initialization will happen, probably not doing the things you \
expect. \
 \
For compatibility the 'logger' attribute can be accessed to use a common \
interface for application logging. \
 \
Using the logger within a class is as simple as consuming a role: \
 \
    package MyClass; \
    use Moose; \
    with 'MooseX::Log::Log4perl'; \
 \
    sub dummy { \
        my $self = shift; \
        $self->log->info('Dummy log entry'); \
    } \
 \
The logger needs to be setup before using the logger, which could happen in \
the main application: \
 \
    package main; \
    use Log::Log4perl qw(:easy); \
    use MyClass; \
 \
    BEGIN { Log::Log4perl->easy_init() }; \
 \
    my $myclass = MyClass->new(); \
    $myclass->log->info('In my class'); # Access the log of the object \
    $myclass->dummy;                    # Will log 'Dummy log entry'"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.47"

RPM_NAME = "perl-MooseX-Log-Log4perl-0.47-2.19.noarch.rpm"
RPM_HASH = "e4e80de297292308142b12e3b5bf58e8ba973f8de3cdd62f60b26c4258dc29161d5d2a4142f242689bbeb497f5887022be13bd57a96394bc4f9cb742c0369e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Log--Log4perl \
perl-MooseX--Log--Log4perl--Easy \
perl-MooseX-Log-Log4perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Log--Log4perl \
perl-Moo"

inherit rpm
