SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-emoji-2.6.0-1.1.noarch.rpm"
RPM_HASH = "44c3de20427cdac55c473787051969700b8140b16555ab1ea5affb72482c1dad468afb3583978c4cec34933a77eba2ec7272f4de817fd79cc593243d7d3f2acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emoji \
python39-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
