SUMMARY = "(DEPRECATED) Send Log::Any logs to a subroutine"
DESCRIPTION = "DEPRECATION NOTICE: Log::Any distribution since 1.708 comes with \
Log::Any::Adapter::Capture which does the same thing. I'm deprecating this \
adapter now. \
 \
This adapter lets you specify callback subroutine to be called by \
Log::Any's logging methods (like $log->debug(), $log->error(), etc) and \
detection methods (like $log->is_warning(), $log->is_fatal(), etc.). \
 \
This adapter is used for customized logging, and is mostly a convenient \
construct to save a few lines of code. You could achieve the same effect by \
creating a full Log::Any adapter class. \
 \
Your logging callback subroutine will be called with these arguments: \
 \
 ($method, $self, $format, @params) \
 \
where $method is the name of method (like 'debug') and ($self, $format, \
@params) are given by Log::Any."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.101"

RPM_NAME = "perl-Log-Any-Adapter-Callback-0.101-1.14.noarch.rpm"
RPM_HASH = "354c1588d9a5cc706aad2405a8d3e6cdea9eebb3972e598c0f22abb13f8f7850aeba8dd7a444cf19c6e155fbafb1676c4346e7c8ab7fb468da5c703032822423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Any--Adapter--Callback \
perl-Log-Any-Adapter-Callback"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Log--Any--Adapter"

inherit rpm
