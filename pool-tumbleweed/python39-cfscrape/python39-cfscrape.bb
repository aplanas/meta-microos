SUMMARY = "Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A simple Python module to bypass Cloudflare's anti-bot page (also known as 'I'm \
Under Attack Mode', or IUAM), implemented with Requests. \
 \
This can be useful if you wish to scrape or crawl a website protected with \
Cloudflare. Cloudflare's anti-bot page currently just checks if the client \
supports Javascript, though they may add additional techniques in the future. \
 \
Due to Cloudflare continually changing and hardening their protection page, \
cfscrape requires Node.js to solve Javascript challenges. This allows the script \
to easily impersonate a regular web browser without explicitly deobfuscating and \
parsing Cloudflare's Javascript. \
 \
Note: This only works when regular Cloudflare anti-bots is enabled (the \
'Checking your browser before accessing...' loading page). If there is a \
reCAPTCHA challenge, you're out of luck. Thankfully, the Javascript check page \
is much more common."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-cfscrape-2.1.1-1.16.noarch.rpm"
RPM_HASH = "e3fe5add0ae57e5c4aede81abb716ab23dc55d588e338d1fe69306fa0fe32c82a70b1a3998d42801b55b3dfae0d2c8226d9d3a9888c9dfd50caf9032c0d6def4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cfscrape \
python39-cfscrape \
python3dist-cfscrape"

RDEPENDS:${PN} += "nodejs \
python-abi \
python39-requests"

inherit rpm
