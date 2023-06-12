SUMMARY = "Perl module Pod::HtmlPsPdf"
DESCRIPTION = "Documentation projects builder in HTML, PS and PDF formats. \
 \
 \
 \
Authors: \
-------- \
    Stas Bekman <stas@stason.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Pod-HtmlPsPdf-0.04-510.30.aarch64.rpm"
RPM_HASH = "366851434af553aec0eabf4714498fbf9bb1ed9257b88b16132994b6cc32f27aae887ae99f0535b816149554e6bc1cb36ec259cb466b735d0825993d2916a199"

RPROVIDES:${PN} += "perl(Pod::HtmlPsPdf) \
perl(Pod::HtmlPsPdf::Book) \
perl(Pod::HtmlPsPdf::Chapter) \
perl(Pod::HtmlPsPdf::Common) \
perl(Pod::HtmlPsPdf::Config) \
perl(Pod::HtmlPsPdf::Html) \
perl(Pod::HtmlPsPdf::RunTime) \
perl-Pod-HtmlPsPdf \
perl-Pod-HtmlPsPdf(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
html2ps \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
