SUMMARY = "SASL Authentication framework"
DESCRIPTION = "SASL is a generic mechanism for authentication used by several network \
protocols. *Authen::SASL* provides an implementation framework that all \
protocols should be able to share. \
 \
The framework allows different implementations of the connection class to \
be plugged in. At the time of writing there were two such plugins. \
 \
* Authen::SASL::Perl \
 \
This module implements several mechanisms and is implemented entirely in \
Perl. \
 \
* Authen::SASL::XS \
 \
This module uses the Cyrus SASL C-library (both version 1 and 2 are \
supported). \
 \
* Authen::SASL::Cyrus \
 \
This module is the predecessor to Authen::SASL::XS. It is reccomended to \
use Authen::SASL::XS \
 \
By default the order in which these plugins are selected is \
Authen::SASL::XS, Authen::SASL::Cyrus and then Authen::SASL::Perl. \
 \
If you want to change it or want to specifically use one implementation \
only simply do \
 \
 use Authen::SASL qw(Perl); \
 \
or if you have another plugin module that supports the Authen::SASL API \
 \
 use Authen::SASL qw(My::SASL::Plugin);"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.16"

RPM_NAME = "perl-Authen-SASL-2.16-6.22.noarch.rpm"
RPM_HASH = "abe97808904bb94814be6d8853f28d6a8789caf87a06845fe7c942b0f394a80155571be9d310d983f04c412e454770530ba91bde64ea83b7d1e68851919291de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Authen--SASL \
perl-Authen--SASL--CRAM-MD5 \
perl-Authen--SASL--EXTERNAL \
perl-Authen--SASL--Perl \
perl-Authen--SASL--Perl--ANONYMOUS \
perl-Authen--SASL--Perl--CRAM-MD5 \
perl-Authen--SASL--Perl--DIGEST-MD5 \
perl-Authen--SASL--Perl--EXTERNAL \
perl-Authen--SASL--Perl--GSSAPI \
perl-Authen--SASL--Perl--LOGIN \
perl-Authen--SASL--Perl--Layer \
perl-Authen--SASL--Perl--PLAIN \
perl-Authen-SASL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--HMAC-MD5"

inherit rpm
