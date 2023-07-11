SUMMARY = "Does your process have access to the web"
DESCRIPTION = "This module attempts to answer, as accurately as it can, one of the \
nastiest technical questions there is. \
 \
*Am I on the internet?* \
 \
The answer is useful in a wide range of decisions. For example... \
 \
_Should my test scripts run the online portion of the tests or just skip \
them?_ \
 \
_Do I try to fetch fresh data from the server?_ \
 \
_If my request to the server breaks, is it because I'm offline, or because \
the server is offline?_ \
 \
And so on, and so forth. \
 \
But a host of networking and security issues make this problem very \
difficult. There are firewalls, proxies (both well behaved and badly \
behaved). We might not have DNS. We might not have a network card at all! \
 \
You might have network access, but only to a for-money wireless network \
that responds to ever HTTP request with a page asking you to enter your \
credit card details for paid access. Which means you don't 'REALLY' have \
access. \
 \
The mere nature of the question makes it practically unsolvable. \
 \
But with the answer being so useful, and the only other alternative being \
to ask the user 'duh... are you online?' (when you might not have a user at \
all) it's my gut feeling that it is worthwhile at least making an attempt \
to solve the problem, if only in a limited way."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.08"

RPM_NAME = "perl-LWP-Online-1.08-12.21.noarch.rpm"
RPM_HASH = "3ebf49858a024a9f4343df635f3924e0781379bb2b180f29d9a866eea8e541497e9e17abadf9b182de1866e542753038bb2651f42fe0041fde37ae5a4c531f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--Online \
perl-LWP-Online"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-LWP--Simple \
perl-URI"

inherit rpm
