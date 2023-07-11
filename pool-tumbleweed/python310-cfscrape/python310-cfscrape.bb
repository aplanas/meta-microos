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

RPM_NAME = "python310-cfscrape-2.1.1-1.16.noarch.rpm"
RPM_HASH = "8fd33e4b52a676f1fe15a186d68691114c36678f4d1852e3275ab4101d1707e564b635cb9fc63cc756f64ac5d20b0c5b17f60f479c897de4b301a872b1144d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cfscrape \
python310-cfscrape \
python3dist-cfscrape"

RDEPENDS:${PN} += "nodejs \
python-abi \
python310-requests"

inherit rpm
