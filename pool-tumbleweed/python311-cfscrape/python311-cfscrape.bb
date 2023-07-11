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

RPM_NAME = "python311-cfscrape-2.1.1-1.16.noarch.rpm"
RPM_HASH = "c56bb162ca3fafee6a5facdb1c37abddf2fef8e9a44d7ac9ecea435801d7730b3159b9ddc28cbee079a602fdeba2f7a0cdd30424604fb314a6da4526d9ddf477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cfscrape \
python3.11dist-cfscrape \
python311-cfscrape \
python3dist-cfscrape"

RDEPENDS:${PN} += "nodejs \
python-abi \
python311-requests"

inherit rpm
