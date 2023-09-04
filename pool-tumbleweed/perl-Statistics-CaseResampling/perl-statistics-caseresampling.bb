SUMMARY = "Efficient resampling and calculation of medians with confidence intervals"
DESCRIPTION = "The purpose of this (XS) module is to calculate the median (or in principle \
also other statistics) with confidence intervals on a sample. To do that, \
it uses a technique called bootstrapping. In a nutshell, it resamples the \
sample a lot of times and for each resample, it calculates the median. From \
the distribution of medians, it then calculates the confidence limits. \
 \
In order to implement the confidence limit calculation, various other \
functions had to be implemented efficiently (both algorithmically efficient \
and done in C). These functions may be useful in their own right and are \
thus exposed to Perl. Most notably, this exposes a median (and general \
selection) algorithm that works in linear time as opposed to the trivial \
implementation that requires 'O(n*log(n))'."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.15"

RPM_NAME = "perl-Statistics-CaseResampling-0.15-1.26.aarch64.rpm"
RPM_HASH = "546de0474cb398672d87310cc37976678b13a990173270c2dbbfbd03d1f3e679e8b94e8ad60e3e6c3c2c4111dc58dc515f441111dc9fe32c40afa91e18bd930c"

RPROVIDES:${PN} += "perl-Statistics--CaseResampling \
perl-Statistics-CaseResampling"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
