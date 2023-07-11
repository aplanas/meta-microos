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

RPM_NAME = "perl-Log-Any-Adapter-Callback-0.101-1.13.noarch.rpm"
RPM_HASH = "80dbcb9dacbc4e541905c9c1d7d06812a9afa6287b195808544685585806bec441121d1128b282533e5ccfdd05fcc83b8514dce9b5c98aa7a57308865c69dcac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Any--Adapter--Callback \
perl-Log-Any-Adapter-Callback"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Log--Any--Adapter"

inherit rpm
