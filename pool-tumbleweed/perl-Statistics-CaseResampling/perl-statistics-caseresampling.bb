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

RPM_NAME = "perl-Statistics-CaseResampling-0.15-1.24.aarch64.rpm"
RPM_HASH = "164c5f0afccf6771135e52ead096dc56d08112be560d87290433500531901f4b28d527089ca248bf6f842de9f93bb95ce5346c500dbe4309b70c75188d2ba122"

RPROVIDES:${PN} += "perl-Statistics--CaseResampling \
perl-Statistics-CaseResampling"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
