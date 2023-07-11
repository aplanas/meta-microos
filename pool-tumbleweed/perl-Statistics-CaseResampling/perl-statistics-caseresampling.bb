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

RPM_NAME = "perl-Statistics-CaseResampling-0.15-1.25.aarch64.rpm"
RPM_HASH = "431b8d1b5215a4cd0cd9070092252304930112093e60a6ed48190d1e564b8a068875fadf1b7bacfc960e367176afc328ed2fa79b99c6f4556ab2a2ccc4160d26"

RPROVIDES:${PN} += "perl-Statistics--CaseResampling \
perl-Statistics-CaseResampling"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
