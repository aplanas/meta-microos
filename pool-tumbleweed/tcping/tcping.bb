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

PV = "1.19.2"

RPM_NAME = "tcping-1.19.2-1.3.aarch64.rpm"
RPM_HASH = "48c52fe21dfa46158d4cd41013115e7c0eb6f3499cf48abb403e1445320c8a918137429428c012d4722803b19a91f07cda04fadb93514d1aeb8c914d5424296d"

RPROVIDES:${PN} += "tcping"

RDEPENDS:${PN} += ""

inherit rpm
