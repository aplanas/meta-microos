SUMMARY = "JSON RPC 2.0 Server Implementation"
DESCRIPTION = "JSON::RPC is a set of modules that implement JSON RPC 2.0 protocol. \
 \
    If you are using old JSON::RPC code (up to 0.96), DO NOT EXPECT \
    YOUR CODE TO WORK WITH THIS VERSION. THIS VERSION IS \
    ****BACKWARDS INCOMPATIBLE****"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.06"

RPM_NAME = "perl-JSON-RPC-1.06-2.24.noarch.rpm"
RPM_HASH = "e2b0021124bd83990035ea44a4fc0a5f781b2ae379d045a6dac1923a2fd3a08e9c6df273ebe35f6cecb03f38d563777ec5f80cd5b069c79cbb400d0cc07e1165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--RPC \
perl-JSON--RPC--Constants \
perl-JSON--RPC--Dispatch \
perl-JSON--RPC--Legacy \
perl-JSON--RPC--Legacy--Client \
perl-JSON--RPC--Legacy--Procedure \
perl-JSON--RPC--Legacy--ReturnObject \
perl-JSON--RPC--Legacy--Server \
perl-JSON--RPC--Legacy--Server--Apache2 \
perl-JSON--RPC--Legacy--Server--CGI \
perl-JSON--RPC--Legacy--Server--Daemon \
perl-JSON--RPC--Legacy--Server--system \
perl-JSON--RPC--Legacy--ServiceObject \
perl-JSON--RPC--Parser \
perl-JSON--RPC--Procedure \
perl-JSON--RPC--Test \
perl-JSON-RPC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CGI \
perl-Class--Accessor--Lite \
perl-HTTP--Request \
perl-HTTP--Response \
perl-JSON \
perl-LWP--UserAgent \
perl-Plack \
perl-Router--Simple \
perl-parent"

inherit rpm
