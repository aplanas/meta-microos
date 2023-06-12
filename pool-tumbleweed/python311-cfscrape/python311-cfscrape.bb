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

RPM_NAME = "python311-cfscrape-2.1.1-1.14.noarch.rpm"
RPM_HASH = "a762cd69a42318f58b3c4831411114937d615e72c6c81fb32fc13120b58ad196ecda0b6799299f522c77f8803dc5a2a9a746cb925a14af358de4e405d1e99261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cfscrape) \
python311-cfscrape \
python3dist(cfscrape)"
RDEPENDS:${PN} += "nodejs \
python(abi) \
python311-requests"

inherit rpm
