SUMMARY = "Rounded or exact English expression of durations"
DESCRIPTION = "This module provides functions for expressing durations in rounded or exact \
terms. \
 \
In the first example in the Synopsis, using duration($interval_seconds): \
 \
If the 'time() - $start_time' is 3 seconds, this prints 'Runtime: *3 \
seconds*.'. If it's 0 seconds, it's 'Runtime: *0 seconds*.'. If it's 1 \
second, it's 'Runtime: *1 second*.'. If it's 125 seconds, you get 'Runtime: \
*2 minutes and 5 seconds*.'. If it's 3820 seconds (which is exactly 1h, 3m, \
40s), you get it rounded to fit within two expressed units: 'Runtime: *1 \
hour and 4 minutes*.'. Using duration_exact instead would return 'Runtime: \
*1 hour, 3 minutes, and 40 seconds*'. \
 \
In the second example in the Synopsis, using ago($interval_seconds): \
 \
If the $age is 3 seconds, this prints '_file_ was modified *3 seconds \
ago*'. If it's 0 seconds, it's '_file_ was modified *just now*', as a \
special case. If it's 1 second, it's 'from *1 second ago*'. If it's 125 \
seconds, you get '_file_ was modified *2 minutes and 5 seconds ago*'. If \
it's 3820 seconds (which is exactly 1h, 3m, 40s), you get it rounded to fit \
within two expressed units: '_file_ was modified *1 hour and 4 minutes \
ago*'. Using ago_exact instead would return '_file_ was modified *1 hour, 3 \
minutes, and 40 seconds ago*'. And if the file's modtime is, surprisingly, \
three seconds into the future, $age is -3, and you'll get the equally and \
appropriately surprising '_file_ was modified *3 seconds from now*.'"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.210000"

RPM_NAME = "perl-Time-Duration-1.210000-1.17.noarch.rpm"
RPM_HASH = "30dcef2c8d37ec3a9d0d92349600aedf202319535b0ab7c6fec67c3439fd6716faf66b7103b15c043555e6827dd261fd06ad42979f87cca6629e3acb01165662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Duration \
perl-Time-Duration"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
