SUMMARY = "Provide https support for LWP::UserAgent"
DESCRIPTION = "The LWP::Protocol::https module provides support for using https schemed \
URLs with LWP. This module is a plug-in to the LWP protocol handling, so \
you don't use it directly. Once the module is installed LWP is able to \
access sites using HTTP over SSL/TLS. \
 \
If hostname verification is requested by LWP::UserAgent's 'ssl_opts', and \
neither 'SSL_ca_file' nor 'SSL_ca_path' is set, then 'SSL_ca_file' is \
implied to be the one provided by Mozilla::CA. If the Mozilla::CA module \
isn't available SSL requests will fail. Either install this module, set up \
an alternative 'SSL_ca_file' or disable hostname verification. \
 \
This module used to be bundled with the libwww-perl, but it was unbundled \
in v6.02 in order to be able to declare its dependencies properly for the \
CPAN tool-chain. Applications that need https support can just declare \
their dependency on LWP::Protocol::https and will no longer need to know \
what underlying modules to install."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.110.0"

RPM_NAME = "perl-LWP-Protocol-https-6.110.0-1.1.noarch.rpm"
RPM_HASH = "d976ab1bf0fc960cf6658502b1b6fdfc1fe0d927874381f2233032d138323a129f1aa9ae3eee7c9798ae4daea1c0dda45f82ac045d63a8ec900937dd87776074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--Protocol--https \
perl-LWP--Protocol--https--Socket \
perl-LWP-Protocol-https"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--SSL \
perl-LWP--Protocol--http \
perl-LWP--UserAgent \
perl-Net--HTTPS"

inherit rpm
