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

RPM_NAME = "python39-cfscrape-2.1.1-1.14.noarch.rpm"
RPM_HASH = "c09278eca4d92369ef892513a05593db9f2c0e4f320df55ad0b281f8717f4e23fc3a484b5389e8655fc247e61174ca2326774f24bc01823c5d0e23620dfe2df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cfscrape) \
python39-cfscrape \
python3dist(cfscrape)"
RDEPENDS:${PN} += "nodejs \
python(abi) \
python39-requests"

inherit rpm
