SUMMARY = "A ping program for TCP ports"
DESCRIPTION = "TCPing will send TCP probes to an IP address or a hostname specified \
by you and prints the result. \
It works with both IPv4 and IPv6. \
 \
TCPING uses different TCP sequence numbering for successful and \
unsuccessful probes, so that when you look at the results and spot \
a failed probe, understanding the total packet drops to that point \
would be illustrative enough. \
 \
 * Monitor your network connection. \
 * Determine packet loss. \
 * Analyze the network's latency. \
 * Show min/avg/max probes latency. \
 * Use the -r flag to retry hostname resolution after a predetermined \
   number of ping failures. If you want to test your DNS load \
   balancing or Global Server Load Balancer (GSLB), you should \
   utilize this option.. \
 * Print connection statistics on Enter key press. \
 * Display the longest encountered downtime and uptime duration and \
   time. \
 * Monitor and audit your peers network. \
 * Calculate the total uptime/downtime when conducting a maintenance. \
 * An alternative to ping in environments that ICMP is blocked."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "tcping-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "43157f114ff2316a2edf9a6c2b62ecaec36516f5f8247cfe3af5431b6c29fb66f15e80fc5a317725b9913333770d67ffc071d6d1f59341557e04165d7917d8dc"

RPROVIDES:${PN} += "tcping"

RDEPENDS:${PN} += ""

inherit rpm
